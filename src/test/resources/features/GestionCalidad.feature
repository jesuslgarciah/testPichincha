1.
Para acceder a la página web de la tienda “My Store”
Como cliente de la tienda
Necesito usar un usuario y clave

Criterios de aceptacion
1. El usuario debe contar con usuario y clave
2. El usuario debe tener un formato de correo valido. Ej: jesusgarcia@gmail.com
3. Si el correo no es valido mostrará un mensaje "Formato de correo no valido" y se le añade un borde rojo a la caja
4. La clave debe tener una longitud minima de 8 caracteres.
5. La clave debe tener al menos 1 letra mayuscula, 1 minuscula, 1 caracter especial y 1 número. Ej: Test1234*
6. Si el formato de la clave no es valido mostrará un mensaje "Formato de clave no valido" y se le añade un borde rojo a la caja
6. El boton de ingresar no se activará hasta que los campos de usuario y clave no se hayan llenado previamente
7. La clave no puede ser almacenada como texto plano en la base de datos (revisar)
8. Si el usuario o la clave no son validos debe mostrar un mensaje generico "Usuario y/o clave invalida"
y no debe dejar acceder a la tienda

-----------------------------------------------------------------------------------------

2.
Para poder realizar la compra de productos
Como cliente de la tienda
Necesito seleccionar productos

Criterios de aceptacion
1. Si un producto no tiene unidades en el inventario debe tener deshabilitado el boton de "Agregar al carrito"
2. Si un producto tiene unidades en el inventario debe tener habilitado el boton de "Agregar al carrito"
3. Debe haber una opcion para agregar o quitar unidades de un producto
4. Mostrar el maximo de unidades existentes en el inventario
5. Se debe poder seleccionar el maximo de productos disponibles segun inventario.
6. Antes de pagar el producto, se debe validar de nuevo la existencia del mismo

-------------------------------------------------------------------------------------

Caso de prueba 1.1.
Dado que soy un usuario registrado en la tienda
Cuando diligencie el formulario de login con usuario y clave validos
Entonces podre acceder a la tienda
Y podre ver el nombre de usuario el la pantalla de inicio

Caso de prueba 1.2.
Dado que soy un usuario registrado en la tienda
Cuando diligencie el formulario de login con usuario y/o clave invalidos
Entonces no podre acceder a la tienda
Y me aparecerá un mensaje generico "Usuario y/o clave invalida"

------------------------------------------------------------------------------------

Caso de prueba 2.1.
Dado que ingrese en la tienda
Y deseo agregar un producto al carrito
Cuando seleccione el producto con inventario disponible
Entonces podré agregarlo al carrito
Y valido que el objeto se encuentre en el carrito

Caso de prueba 2.2.
Dado que ingrese en la tienda
Y deseo agregar un producto al carrito
Cuando seleccione el producto sin inventario disponible
Entonces no podré agregarlo al carrito

------------------------------------------------------------------------------------