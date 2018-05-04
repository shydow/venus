# quick start

## env config

export CONFIG_SERVICE_PASSWORD=root
export MONGODB_PASSWORD=root
export DROOLS_SERVICE_PASSWORD=root
export MONGODB_DIR=/private/tmp/data/auth-mongodb

## build project
mvn package -Dmaven.test.skip=true

## start dockers
docker-compose up