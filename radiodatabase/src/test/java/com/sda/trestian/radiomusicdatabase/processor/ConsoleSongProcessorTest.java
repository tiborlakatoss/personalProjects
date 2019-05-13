package com.sda.trestian.radiomusicdatabase.processor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConsoleSongProcessorTest {

	private ConsoleSongProcessor consoleSongProcessor;

	@Before
	public void setUp() {
		consoleSongProcessor = new ConsoleSongProcessor();
	}

	@Test
	public void test_readNumberOfSongsFromConsole_validNumber() {
		int numberOfSongs = consoleSongProcessor.readNumberOfSongs();
		Assert.assertEquals(3, numberOfSongs);
	}

	@Test
	public void test_readNumberOfSongsFromConsole_invalidCharacter() {
		try {
			int numberOfSongs = consoleSongProcessor.readNumberOfSongs();
			Assert.fail();
		} catch (NumberFormatException e) {
			Assert.assertTrue(true);
		}

	}
}
