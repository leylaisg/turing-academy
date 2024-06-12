image: nginx:latest
container_name: leyla-nginx
ports:
- "8088:80"
volumes:
- ./nginx.conf:/etc/nginx/nginx.conf:ro
- ./html:/usr/share/nginx/html:ro


image: postgres:latest
container_name: leyla-postgres
environment:
POSTGRES_DB: postgres
POSTGRES_USER: postgres
POSTGRES_PASSWORD: postgresleyla
volumes:
- postgres-data:/var/lib/postgresql/data