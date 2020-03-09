# jenkins-test

## Prerequisites

Docker should be installed

## Usage

### Build an image

`docker build -t jenkins-test:0.1 .`

### Run a container

`docker run -d -p 8080:8080 -p 50000:50000 -v jenkins_home:/var/jenkins_home jenkins-test:0.1`
