fun main() {
    val ip1 = "192.145.233.333"
    val ip2 = "256.256.256.256"
    val ip3 = "192.168.1.1"
    val ip4 = "0.0.0.0"
    val ip5 = "300.300.300.300"
    val ip6 = "192.145.233"
    val ip7 = "256.255.254.255."
    val ip8 = "192.145.233"
    val ip9 = "256.255.254.255.344"
    val ip10 = "256.255.254.022"
    val ip11 = ".255.254.022.344"
    val ip12 = ".255.254.rfe.342"

    test("larger then 255 IPv4 1", isValidIPv4(ip1), false)
    test("Invalid IPv4 out of range", isValidIPv4(ip2), false)
    test("Valid IPv4 ", isValidIPv4(ip3), true)
    test("Valid IPv4 all zeros", isValidIPv4(ip4), true)
    test("Invalid IPv4 out of range", isValidIPv4(ip5), false)
    test("Invalid IPv4 not enough segments", isValidIPv4(ip6), false)
    test("Invalid IPv4 more then 3 dots", isValidIPv4(ip7), false)
    test("Invalid IPv4 not enough segments", isValidIPv4(ip8), false)
    test("Invalid IPv4 more then  3 numeric numbers", isValidIPv4(ip9), false)
    test("Invalid IPv4 not leading 0", isValidIPv4(ip10), false)
    test("Invalid IPv4 starts with . ", isValidIPv4(ip11), false)
    test("Invalid IPv4 starts contain charecter ", isValidIPv4(ip12), false)

}

fun test(name: String, result: Boolean, correctResult: Boolean) {
    if (result == correctResult) {
        println("Success: $name")
    } else {
        println("Fail: $name")
    }
}