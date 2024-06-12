nginx

docker pull nginx
docker run --name leyla -p 8080:80 -d nginx
docker run --name leyla-nginx -p 8088:80 -d nginx
docker ps -a
docker stop leyla
docker restart leyla
docker stop leyla-nginx
docker rm leyla-nginx

postgres

docker run --name leyla-postgres -e POSTGRES_PASSWORD=postgresleyla -d postgres
docker ps -a
docker rm d9 -f