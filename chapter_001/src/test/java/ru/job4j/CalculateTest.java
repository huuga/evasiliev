package ru.job4j;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test
 *
 * @author Eugene Vasilev (huuga@inbox.ru)
 * @version $Id$
 * @since 09.01.2018
 */
public class CalculateTest {
	/**
	 * Test echo
	 */	@Test
	public void whenTakeNameThenThreeEchoPlusName() {
			String input = "Petr Arsentev";
			String expect = "Echo, echo, echo : Petr Arsentev";
			Calculate calc = new Calculate();
			String result = calc.echo(input);
			assertThat(result, is(expect));
		}
}
	