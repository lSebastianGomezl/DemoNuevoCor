pipeline {
    agent{
        label 'principal'
    }

    environment {
        // Definir variables de entorno para usarlas en el pipeline
         BASE_URL= "https://dcsas-backoffice.konexinnovation.com/"
        // URL = "http://localhost:8080"
        USUARIO = "14321990"
        CONTRASENNA = 'M4n1z4l3s$'
        TIPO_DOCUMENTO = "Cédula de ciudadanía"
        JAVA_HOME = "C:\\Program Files\\Java\\jdk1.8.0_45"
        PATH = "C:\\Users\\sebastian.gomez\\Documents\\Nuevo cor\\pagatodo-automatizacion-front-backoffices-master\\Multiempresa\\chromedriver.exe"
    }

    stages {
        stage('Checkout') {
            steps {
                // Obtener el código fuente del repositorio configurado
                checkout scm
            }
        }

        stage('Get IP') {
            steps {
                // Obtener la dirección IP pública del entorno de Jenkins usando un comando de Windows
                bat 'nslookup myip.opendns.com resolver1.opendns.com'
            }
        }

        stage('Set Up Environment') {
            steps {
                script {
                    // Configurar las variables de entorno en Jenkins
                    env.PATH = "${PATH};${env.PATH}"
                }
            }
        }

        stage('Build') {
            steps {
                dir('Multiempresa') {
                    // Compilar el proyecto utilizando Gradle, excluyendo las pruebas
                    bat './gradlew.bat clean build -x test'
                }
            }
        }

        stage('Test') {
            steps {
                dir('Multiempresa') {
                    // Establecer variables de entorno y ejecutar las pruebas específicas utilizando Gradle
                    bat """
                        ./gradlew.bat test --tests "co.com.konex.certification.login.backoffice.runners.gestiodistribuidor.FiltrosGestDistRunner"
                    """
                }
            }
            post {
                always {
                    // Publicar resultados de las pruebas independientemente del resultado
                    junit 'Multiempresa/build/test-results/test/*.xml'
                }
            }
        }
    }

    post {
        always {
            // Limpiar el workspace después de que el pipeline haya terminado
            cleanWs()
        }
    }
}
