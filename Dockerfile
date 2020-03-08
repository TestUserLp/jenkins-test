FROM jenkins/jenkins:lts
COPY plugins.txt /usr/share/jenkins/ref/plugins.txt
COPY jobs/jenkins_declarative/config.xml.override /usr/share/jenkins/ref/jobs/jenkins_declarative/config.xml.override
COPY jobs/jenkins_scripted/config.xml.override /usr/share/jenkins/ref/jobs/jenkins_scripted/config.xml.override
RUN /usr/local/bin/install-plugins.sh < /usr/share/jenkins/ref/plugins.txt
