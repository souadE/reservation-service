stages {
stage('clean') {
steps {
mvn clean #clean maven project
}
}
stage('package') {
steps {
sudo mvn package #package maven project

}
}
stage('create docker image') {
steps {
sudo docker build -f Dockerfile -t docker-spring-boot .  
}
}
}
