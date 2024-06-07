pipeline {
    agent {
        label 'windows' // Especifica el nodo de Jenkins que ejecutará este pipeline, ajusta según sea necesario.
    }
    stages {
        stage('Checkout') {
            steps {
                // Chequeo del código fuente desde el repositorio.
                checkout scm
            }
        }
        stage('Get IP') {
            steps {
                // Ejecutar comando de línea para obtener la IP.
                bat 'nslookup myip.opendns.com resolver1.opendns.com'
            }
        }
        stage('Build') {
            steps {
                // Ejecutar gradlew clean build.
                dir('Multiempresa') {
                    bat './gradlew clean build -x test'
                }
            }
        }
        stage('Copy Files') {
            steps {
                // Copiar archivos al directorio de artefactos.
                script {
                    def targetFolder = "${env.WORKSPACE}/artifact"
                    sh "mkdir -p ${targetFolder}"
                    sh "cp -r Multiempresa/* ${targetFolder}"
                }
            }
        }
        stage('Publish Artifact') {
            steps {
                // Publicar artefactos de build.
                archiveArtifacts artifacts: 'artifact/**', fingerprint: true
            }
        }
    }
}
