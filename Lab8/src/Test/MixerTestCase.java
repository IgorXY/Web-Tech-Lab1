package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Logic.Mixer;

public class MixerTestCase {
	Mixer mixer = new Mixer();

	@Test
	public void TestRight() {
		double[] a = {1, 5, 9};
		double[] b = {3, 7};
		int[] indexes = mixer.MixArray(a, b);
		int[] exp = {2, 3};
		assertArrayEquals(exp, indexes);
	}

}
