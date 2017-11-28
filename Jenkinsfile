node {
  stage('Compile') {
    checkout([$class: 'GitSCM', branches: [[name: '*/master']], userRemoteConfigs: [[credentialsId: '5c05a213-e250-4cfe-8980-6f2ceeed88ec', url: 'http://www.github.com/sanderp1/jenkinspipelinelab']]])
    sh './gradlew classes'
  }
  stage('Test') {
    sh './gradlew test'
    step
  }
}
