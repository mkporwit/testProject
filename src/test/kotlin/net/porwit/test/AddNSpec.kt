package net.porwit.test

import net.porwit.test.AddN
import org.amshove.kluent.`should equal`
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

class AddNSpec : Spek({
    given("A simple test") {
        on("creating a new net.porwit.test.AddN") {
            val adder = AddN(5)
            it("should properly add") {
                val result = adder.add(3)
                result `should equal` 8
            }
        }
    }
})