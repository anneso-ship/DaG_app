import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Message } from '../model/message';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MessageService {

  constructor(private http : HttpClient) { }


   getTheMessage(): Observable<Message[]>{
          return this.http.get<Message[]>('http://adg_backend_container:8081/message/sentence');
      }


}
