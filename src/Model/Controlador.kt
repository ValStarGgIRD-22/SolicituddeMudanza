class Controlador {
    private val vista = Vista()

    fun iniciar() {
        val cliente = vista.obtenerDatosCliente()
        val repartidor = vista.obtenerDatosEmpleado()
        val solicitud = vista.obtenerDatosSolicitud(cliente, repartidor)

        vista.mostrarMensaje("¡Solicitud de mudanza creada con éxito!\n$solicitud")
    }
}

// Función principal (Main)
fun main() {
    val controlador = Controlador()
    controlador.iniciar()
}