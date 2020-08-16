// main function
fun main() {
    val officeOpen = 7
    val now = 20
    val office: String
    office = if (now > officeOpen) {
        "Kantor Sudah Dibuka"
    } else {
        "Kantor Ditutup"
    }

    print(office)
}