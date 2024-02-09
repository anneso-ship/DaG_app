FROM node:18.17.0
RUN mkdir -p /app
WORKDIR /app
COPY package*.json /app
RUN npm install -g @angular/cli
RUN npm install
COPY . .
RUN npm run build --prod
CMD [ "npm", "start" ]


