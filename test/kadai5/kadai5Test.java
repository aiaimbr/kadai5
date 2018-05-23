package kadai5;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;


public class kadai5Test {


	@Test
	public void translateEngで5からfiveに変換できる(){
		IntToEng ie = new IntToEng();
		String expected = "five";
		String actual = ie.translateEng(5);
		assertThat(actual, is(expected));
	}
	@Test
	public void Tenで17からseventeenに変換できる(){
		IntToEng ie = new IntToEng();
		String expected = "seventeen";
		String actual = ie.Ten(17);
		assertThat(actual, is(expected));
	}

	@Test
	public void translateEngで23からtwentythreeに変換できる(){
		IntToEng ie = new IntToEng();
		String expected = "twenty three";
		String actual = ie.translateEng(23);
		assertThat(actual, is(expected));
	}
	@Test
	public void Hundredで23からtwentythreeに変換できる(){
		IntToEng ie = new IntToEng();
		String expected = "twenty three";
		String actual = ie.Hundred(23);
		assertThat(actual, is(expected));
	}

	@Test
	public void translateEngで125からonehandredtwentyfiveに変換できる(){
		IntToEng ie = new IntToEng();
		String expected = "one hundred twenty five";
		String actual = ie.translateEng(125);
		assertThat(actual, is(expected));
	}

	@Test
	public void Hundredで123からonehundredtwentythreeに変換できる(){
		IntToEng ie = new IntToEng();
		String expected = "one hundred twenty three";
		String actual = ie.Hundred(123);
		assertThat(actual, is(expected));
	}

	@Test
	public void translateEngで1256からonethousandtwohundredfiftysixに変換できる(){
		IntToEng ie = new IntToEng();
		String expected = "one thousand two hundred fifty six";
		String actual = ie.translateEng(1256);
		assertThat(actual, is(expected));
	}


	@Test
	public void translateEngで14204568からonemilliontwothousandfivehundredsixtyeightに変換できる(){
		IntToEng ie = new IntToEng();
		String expected = "forteen million two hundred four thousand five hundred sixty eight";
		String actual = ie.translateEng(14204568);
		assertThat(actual, is(expected));
	}


	@Test
	public void TeensPlaceで7からseventeenに変換できる(){
		IntToEng ie = new IntToEng();
		String expected = "seventeen";
		String actual = ie.TeensPlace(7);
		assertThat(actual, is(expected));
	}


	@Test
	public void TensPlaceで7からseventy変換できる(){
		IntToEng ie = new IntToEng();
		String expected = "seventy";
		String actual = ie.TensPlace(7);
		assertThat(actual, is(expected));
	}


	@Test
	public void OnesPlaceで7からsevenに変換できる(){
		IntToEng ie = new IntToEng();
		String expected = "seven";
		String actual = ie.OnesPlace(7);
		assertThat(actual, is(expected));
	}



	}


