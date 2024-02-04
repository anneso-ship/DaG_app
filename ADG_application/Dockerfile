FROM node:16-alpine3.11 as adg_frontend_image

WORKDIR /app

COPY . .

RUN npm install

RUN npm run build

FROM httpd:alpine3.15

WORKDIR /usr/local/apache2/htdocs

COPY --from=adg_frontend_image /app/dist/adg-application .