node {
    checkout scm

    docker.withRegistry('https://registry.hub.docker.com', 'dockerhub') {

        def customImage = docker.build("my-image:${souad95/docker-spring-boot}")

        /* Push the container to the custom Registry */
        customImage.push()
    }
}
