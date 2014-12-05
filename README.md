usablespace
===========

Get available memory space from iOS/Android Device

Plugin para Apache Cordova que mostra a quantidade de espaço de armazenamento disponível em dispositivos Android e iOS

Plataformas: Android 3.2 + e iOS 6 +
Cordova: 3.5.0 +

INSTRUÇÕES

-Instalação

Com o plugman:
    
    Exemplo: plugman install --platform android --project /users/unasus/desktop/gabriel/unasus/una-sus-store-app/appunasusstore/unasusstore/platforms/android --plugin /users/unasus/desktop/gabriel/unasus/usablespacecordovaplugin/usablespace

Com o Cordova CLI
    
    cordova plugin add org.unasus.usablespace

-Usando

```js
    window.UsableSpace.getUsableSpace(function(sucesso){
            console.log(“Espaço livre: “+sucesso+” bytes”);
        }, function(erro){
            console.log(“Houve um problema:  “+erro);
        }
    ); 
```

Autores
    
    Gabriel Castro (gabri.gcl@gmail.com)
    Luís Paulo Moraes (l7moraes@gmail.com)

