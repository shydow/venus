# quick start

## env config

export CONFIG_SERVICE_PASSWORD=root
export MONGODB_PASSWORD=root
export DEMO_SERVICE_PASSWORD=root
export AUTH_MONGODB_DIR=/private/tmp/data/auth-mongodb
export DEMO_MONGODB_DIR=/private/tmp/data/demo-mongodb


## build project
mvn package -Dmaven.test.skip=true

## start dockers
docker-compose up