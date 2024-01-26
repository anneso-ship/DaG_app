import { Component, OnInit } from '@angular/core';
import { Message } from '../model/message';
import { MessageService } from '../service/message.service';
import { Observable } from 'rxjs';


@Component({
  selector: 'app-hello-world',
  templateUrl: './hello-world.component.html',
  styleUrls: ['./hello-world.component.scss']
})
export class HelloWorldComponent implements OnInit {

    message$! : Observable<Message[]>;

    constructor(private messageService: MessageService) { }

    ngOnInit(): void {
           this.message$ = this.messageService.getTheMessage();
           this.message$.subscribe(data => console.log('Received data:', data));
    }

}
