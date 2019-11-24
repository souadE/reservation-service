stages {
stage('clean') {
steps {
mvn clean 
}
}
stage('package') {
steps {
sudo mvn package 

}
}
stage('create docker image') {
steps {
sudo docker build -f Dockerfile -t docker-spring-boot .  
}
}
}
