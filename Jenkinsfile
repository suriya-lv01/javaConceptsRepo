node('master') {
	checkout scm

stage('build') {
    withMaven(jdk: 'JDK1.8', maven: 'Maven') {
		bat 'mvn -X -f ".\\coreJavaConcepts\\pom.xml" clean install'
	}
}
}
