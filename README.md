# jenkins-test

## Prerequisites

1. Docker should be installed
2. For Windows users - linux containers should be enabled

## Usage

### Build an image

`docker build -t jenkins-test:0.1 .`

### Run a container

`docker run -d -p 8080:8080 -p 50000:50000 -v jenkins_home:/var/jenkins_home jenkins-test:0.1`

### Navigate

`localhost:8080`

## Brief description
As a result of usage steps completion, Jenkins master node will be deployed without security configured but with 2 preconfigured pipeline jobs:
- jenkins_declarative
- jenkins_scripted

The initial motivation of that is to show differences in 2 types of pipeline syntax.

Jobs are preconfigured to use a node with a specific label `ubuntu`. This label is not added by default to the master node. Therefore, initial job run will be stuck. To fix that, add the label `ubuntu` in Manage Jenkins -> Manage Nodes.
