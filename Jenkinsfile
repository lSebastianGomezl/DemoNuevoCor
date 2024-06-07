pipeline {
    agent {
        label 'principal'
    }
    environment {
        URL = 'https://dcsas-backoffice.konexinnovation.com/'
        USUARIO = '14321990'
        CONTRASENNA = 'M4n1z4l3s$'
        TIPO_DOCUMENTO = 'Cédula de ciudadanía'
        PATH = "${env.PATH};D:\\chromedriver"  // Añade el directorio de chromedriver al PATH
    }
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Get IP') {
            steps {
                bat 'nslookup myip.opendns.com resolver1.opendns.com'
            }
        }
        stage('Build') {
            steps {
                dir('Multiempresa') {
                    bat 'gradlew.bat clean build -x test'
                }
            }
        }
        stage('Print Env Vars') {
            steps {
                bat 'echo URL=%URL%'
                bat 'echo USUARIO=%USUARIO%'
                bat 'echo CONTRASENNA=%CONTRASENNA%'
                bat 'echo TIPO_DOCUMENTO=%TIPO_DOCUMENTO%'
                bat 'echo PATH=%PATH%'
                bat 'chromedriver --version'  // Verificar si ChromeDriver está accesible y su versión
            }
        }
        stage('Test') {
            steps {
                dir('Multiempresa') {
                    bat '''
                    gradlew.bat clean test --tests "co.com.konex.certification.login.backoffice.runners.gestiodistribuidor.FiltrosGestDistRunner"
                    '''
                }
            }
            post {
                always {
                    junit 'Multiempresa/build/test-results/test/*.xml'
                }
            }
        }
        stage('Copy Files') {
            steps {
                script {
                    def targetFolder = "${env.WORKSPACE}/artifact"
                    bat "mkdir ${targetFolder}"
                    bat "xcopy /E /I /Y Multiempresa ${targetFolder}"
                }
            }
        }
        stage('Publish Artifact') {
            steps {
                archiveArtifacts artifacts: 'artifact/**', fingerprint: true
            }
        }
    }
}
