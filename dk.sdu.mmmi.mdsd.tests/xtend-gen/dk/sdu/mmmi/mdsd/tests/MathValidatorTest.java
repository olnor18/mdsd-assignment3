package dk.sdu.mmmi.mdsd.tests;

import com.google.inject.Inject;
import dk.sdu.mmmi.mdsd.math.MathExp;
import java.util.function.Consumer;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(MathInjectorProvider.class)
@SuppressWarnings("all")
public class MathValidatorTest {
  @Inject
  @Extension
  private ParseHelper<dk.sdu.mmmi.mdsd.math.Math> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void noRepeatedGlobalVarDeclaration() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var x = 1*2");
      _builder.newLine();
      _builder.append("var y = 42");
      _builder.newLine();
      _builder.append("var x = let i = y in i end");
      _builder.newLine();
      final dk.sdu.mmmi.mdsd.math.Math result = this._parseHelper.parse(_builder);
      final Consumer<MathExp> _function = (MathExp line) -> {
        int _size = this._validationTestHelper.validate(line.eResource()).size();
        boolean _greaterThan = (_size > 0);
        Assertions.assertTrue(_greaterThan);
      };
      result.getLines().forEach(_function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
