<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Acceso SISCLICO</title>
        <link rel="stylesheet" href="./asset/styles/login.css" />

    </head>
    <body>
        <main class="login">
            <section class="login__container">
                <form class="login__container--form" action="CValidar" method="post">

                    <div class="login__container--banner">
                        <img src="asset/img/logo-umbrella.png" alt="" />
                    </div>

                    <div class="login--input">
                        <p>Usuario:</p>
                        <div class="input">
                            <input type="text" name="txtUsuario" id="txtusuario" placeholder="Usuario"/>
                        </div>
                    </div>
                    <div class="login--input">
                        <p>Password:</p>
                        <div class="input">
                            <input type="text" id="txtpassword" name="txtPassword" placeholder="Password" />
                        </div>
                    </div>
                    <div class="login--button">
                        <button class="button submit" type="submit" name="accion" value="Ingresar">Ingresar</button>
                        <button class="button reset" type="reset">Limpiar</button>

                    </div>
                </form>
            </section>
        </main>
    </body>
</html>
