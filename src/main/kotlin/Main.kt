fun main(args: Array<String>) {

    // Liest den Namen ein, und begrüßt den Nutzer
    println("Hallo, wie heißt du? (Bestätitige mithilfe von Enter)")
    var name = readln()
    println("Hallo $name!")

    // Druckt eine leere Zeile aus
    println()

    // Dieses Symbol " $ " ein Adressierer, um die Variable "alter" Zuortbar zu machen.
    println("Wie alt bist du? (Bestätitige mithilfe von Enter)")
    var alter = readln()    // Diese Zeile liest das Alter ein
    println("Wow! Bereits $alter Jahre?!")
}