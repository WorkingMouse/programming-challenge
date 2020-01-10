<?php

class Program {

	private $phrases = [
		"Hello" => "Ellohay",
		"Pig Latin" => "Igpay Atinlay",
		"The first month is Janurary" => "Ethay irstfay onthmay isway Anuraryjay",
		"The floor is sticky" => "Ethay oorflay isway ickystay"
	];

	public function __construct() {
		foreach ($this->phrases as $english => $pigLatinActual) {
			$this->testEquals($english, $pigLatinActual, $this->translateEnglishToPigLatin($english));
		}
	}

	private function translateEnglishToPigLatin($english) {
		// TODO
		return "";
	}

	private function testEquals($input, $expect, $actual) {
		if (strtolower($expect) == strtolower($actual)) {
			if ($expect != strtolower($expect) && $expect == $actual) {
				echo "PASS (Bonus)! $input -> $actual\n";
			} else {
				echo "PASS! $input -> $actual\n";
			}
		} else {
			echo "FAIL!\n";
			echo "  Input: $input\n";
			echo "  Expect: $expect\n";
			echo "  Actual: $actual\n";
		}
	}

}

new Program();