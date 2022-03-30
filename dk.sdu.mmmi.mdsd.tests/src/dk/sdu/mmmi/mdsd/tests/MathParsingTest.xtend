/*
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.tests

import com.google.inject.Inject
import dk.sdu.mmmi.mdsd.math.*
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

import static extension dk.sdu.mmmi.mdsd.generator.MathGenerator.compute

@ExtendWith(InjectionExtension)
@InjectWith(MathInjectorProvider)
class MathParsingTest {
	@Inject extension ParseHelper<Math> 
	
	// T01 Minimal
	@Test
	def void loadModel() {
		val result = '''var x = 42'''.parse
		Assertions.assertNotNull(result)
		result.lines.forEach[line|
			val errors = line.eResource.errors
    		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
        ]
	}
	
	// T02 Operations
	@Test
	def void number() {
		val result = '''
			var x = 42
		'''.parse
		val variables = result.compute
		Assertions.assertEquals(42, variables.get("x"))
	}
	
	@Test
	def void simpleAddition() {
		val result = '''
			var x = 40 + 2
		'''.parse
		val variables = result.compute
		Assertions.assertEquals(42, variables.get("x"))
	}
	
	@Test
	def void threeNumbersAddition() {
		val result = '''
			var x = 22 + 18 + 2
		'''.parse
		val variables = result.compute
		Assertions.assertEquals(42, variables.get("x"))
	}
	
	@Test
	def void subtraction() {
		val result = '''
			var x = 46 - 4
		'''.parse
		val variables = result.compute
		Assertions.assertEquals(42, variables.get("x"))
	}
	
	@Test
	def void subtractionNonCommutative() {
		val result = '''
			var x = 4 - 46
		'''.parse
		val variables = result.compute
		Assertions.assertEquals(-42, variables.get("x"))
	}
	
	@Test
	def void threeNumbersSubtraction() {
		val result = '''
			var x = 42 - 4 - 80
		'''.parse
		val variables = result.compute
		Assertions.assertEquals(-42, variables.get("x"))
	}
	
	@Test
	def void additionAndSubtraction() {
		val result = '''
			var x = 100-20+10-3
		'''.parse
		val variables = result.compute
		Assertions.assertEquals(87, variables.get("x"))
	}
	
	@Test
	def void multiplication() {
		val result = '''
			var x = 5*4
		'''.parse
		val variables = result.compute
		Assertions.assertEquals(20, variables.get("x"))
	}
	
	@Test
	def void threeNumbersMultiplication() {
		val result = '''
			var x = 5*4*6
		'''.parse
		val variables = result.compute
		Assertions.assertEquals(120, variables.get("x"))
	}
	
	@Test
	def void division() {
		val result = '''
			var x = 20/4
		'''.parse
		val variables = result.compute
		Assertions.assertEquals(5, variables.get("x"))
	}
	
	@Test
	def void divisionNonCommutative() {
		val result = '''
			var x = 4 / 20
		'''.parse
		val variables = result.compute
		Assertions.assertEquals(0, variables.get("x"))
	}
	
	@Test
	def void threeNumbersDivision() {
		val result = '''
			var x = 120/6/5
		'''.parse
		val variables = result.compute
		Assertions.assertEquals(4, variables.get("x"))
	}
	
	@Test
	def void multiplicationAndDivision() {
		val result = '''
			var x = 100*20/10*3
		'''.parse
		val variables = result.compute
		Assertions.assertEquals(600, variables.get("x"))
	}
	
	@Test
	def void multipleVariables() {
		val result = '''
			var x = 42
			var y = 100-20+10-3
			var z = 100*20/10*3
		'''.parse
		val variables = result.compute
		Assertions.assertEquals(42, variables.get("x"))
		Assertions.assertEquals(87, variables.get("y"))
		Assertions.assertEquals(600, variables.get("z"))
	}
	
	// T03 associative
	@Test
	def void parenthesis() {
		val result = '''
			var x = (10+3)*7-4
		'''.parse
		val variables = result.compute
		Assertions.assertEquals(87, variables.get("x"))
	}
	
	@Test
	def void precedence() {
		val result = '''
			var x = 10+3*4-12/3+3
		'''.parse
		val variables = result.compute
		Assertions.assertEquals(21, variables.get("x"))
	}
	

	// T04 Let binding
	@Test
	def void letNumber() {
		val result = '''
			var x = let y=42 in y end
		'''.parse
		val variables = result.compute
		Assertions.assertEquals(42, variables.get("x"))
	}
	
	@Test
	def void letNumberExpression() {
		val result = '''
			var x = let y=10*8 in y+7 end
		'''.parse
		val variables = result.compute
		Assertions.assertEquals(87, variables.get("x"))
	}
	

	@Test
	def void nestedLet() {
		val result = '''
			var x = let y=2 in let z=3 in y*z end + y end + 79
		'''.parse
		val variables = result.compute
		Assertions.assertEquals(87, variables.get("x"))
	}

	@Test
	def void letVariableShadowing() {
		val result = '''
			var x = let y=2 in let y=3 in y*y end + y end + 76
		'''.parse
		val variables = result.compute
		Assertions.assertEquals(87, variables.get("x"))
	}

	//T05 var binding
	@Test
	def void referenceSingleVar(){
		val result = '''
			var x = 42
			var y = x
		'''.parse
		val variables = result.compute
		Assertions.assertEquals(42, variables.get("x"))
		Assertions.assertEquals(42, variables.get("y"))
	}
	
	@Test
	def void referenceExpressionVar(){
		val result = '''
			var x = 40 + 2
			var y = x * 2
		'''.parse
		val variables = result.compute
		Assertions.assertEquals(42, variables.get("x"))
		Assertions.assertEquals(84, variables.get("y"))
	}
	
	@Test
	def void letUseGlobalVariableBody() {
		val result = '''
			var x = 21
			var y = let i = 2 in i*x end
		'''.parse
		val variables = result.compute
		Assertions.assertEquals(42, variables.get("y"))
	}

	@Test
	def void letUseGlobalVariableBinding() {
		val result = '''
			var x = 21
			var y = let i = x in i*2 end
		'''.parse
		val variables = result.compute
		Assertions.assertEquals(42, variables.get("y"))
	}
	
	@Test
	def void letUseGlobalVariableShadowing() {
		val result = '''
			var x = 20
			var y = let x = 21 in x*2 end
		'''.parse
		val variables = result.compute
		Assertions.assertEquals(20, variables.get("x"))
		Assertions.assertEquals(42, variables.get("y"))
	}
	
	@Test
	def void letUseGlobalVariableBindingSameName() {
		val result = '''
			var x = 21
			var y = let x = x in x*2 end
		'''.parse
		val variables = result.compute
		Assertions.assertEquals(21, variables.get("x"))
		Assertions.assertEquals(42, variables.get("y"))
	}
	
	
}
