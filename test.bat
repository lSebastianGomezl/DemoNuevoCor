@echo off

REM Cambiar la página de código a UTF-8 
chcp 65001

REM Configurar variables de entorno
set url=https://dcsas-backoffice.konexinnovation.com/
set usuario=14321990
set contrasenna=M4n1z4l3s$
set "tipoDocumento=C%C3%A9dula%20de%20ciudadan%C3%ADa"

REM Imprimir valores de las variables para depuración
echo URL: %url%
echo Usuario: %usuario%
echo Contraseña: %contrasenna%
echo Tipo de Documento: %tipoDocumento%

REM Agregar la ruta de ChromeDriver al PATH
set "CHROMEDRIVER_PATH=C:\Users\sebastian.gomez\Documents\Nuevo cor\pagatodo-automatizacion-front-backoffices-master\Multiempresa"
set "PATH=%PATH%;%CHROMEDRIVER_PATH%"

REM Navegar al directorio de trabajo
cd "C:\Users\sebastian.gomez\Documents\Nuevo cor\pagatodo-automatizacion-front-backoffices-master\Multiempresa"

REM Verificar la versión de ChromeDriver
chromedriver --version

REM Ejecutar las pruebas con Gradle, pasando las variables como propiedades del sistema
gradlew.bat test --tests "co.com.konex.certification.login.backoffice.runners.gestiodistribuidor.FiltrosGestDistRunner" -Durl=%url% -Dusuario=%usuario% -Dcontrasenna=%contrasenna% -DtipoDocumento=%tipoDocumento%

REM Comprobar el código de salida de las pruebas
if %errorlevel% neq 0 (
    echo Tests failed
    exit /b %errorlevel%
) else (
    echo Tests passed
    exit /b 0
)
