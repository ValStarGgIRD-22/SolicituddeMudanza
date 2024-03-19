import java.util.*

class Vista {
    private val scanner = Scanner(System.`in`)

    fun mostrarMensaje(mensaje: String) {
        println(mensaje)
    }

    fun obtenerDatosCliente(): Cliente {
        println("Ingrese los datos del cliente:")
        print("ID: ")
        val id = scanner.nextInt()
        scanner.nextLine() // Limpiar el buffer
        print("Nombre: ")
        val nombre = scanner.nextLine()
        print("Teléfono: ")
        val telefono = scanner.nextLine()
        print("Dirección: ")
        val direccion = scanner.nextLine()

        return Cliente(id, nombre, telefono, direccion)
    }

    fun obtenerDatosEmpleado(): Empleado {
        println("Ingrese los datos del empleado (repartidor):")
        print("ID: ")
        val id = scanner.nextInt()
        scanner.nextLine() // Limpiar el buffer
        print("Nombre: ")
        val nombre = scanner.nextLine()
        print("Teléfono: ")
        val telefono = scanner.nextLine()
        print("Dirección: ")
        val direccion = scanner.nextLine()

        return Empleado(id, nombre, telefono, direccion)
    }

    fun obtenerDatosSolicitud(cliente: Cliente, repartidor: Empleado): SolicitudMudanza {
        println("Ingrese los datos de la solicitud de mudanza:")
        print("ID de la solicitud: ")
        val id = scanner.nextInt()
        scanner.nextLine() // Limpiar el buffer
        print("Fecha: ")
        val fecha = scanner.nextLine()
        print("Dirección de origen: ")
        val direccionOrigen = scanner.nextLine()
        print("Dirección de destino: ")
        val direccionDestino = scanner.nextLine()

        return SolicitudMudanza(id, cliente, repartidor, fecha, direccionOrigen, direccionDestino)
    }
}
