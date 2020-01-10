using System;
using System.Linq;
using System.Collections.Generic;
using System.Text.RegularExpressions;

namespace programming_challenge
{
	class Program
	{

		private Dictionary<string, string> phrases = new Dictionary<string, string>()
			{
				{"Hello", "Ellohay"},
				{"Pig Latin", "Igpay Atinlay"},
				{"The first month is Janurary", "Ethay irstfay onthmay isway Anuraryjay"},
				{"The floor is sticky", "Ethay oorflay isway ickystay"}
			};

		static void Main(string[] args)
		{
			new Program();
		}

		public Program()
		{
			foreach (var pair in phrases) {
				testEquals(pair.Key, pair.Value, translateEnglishToPigLatin(pair.Key));
			}
		}

		private string translateEnglishToPigLatin(string english)
		{
			// TODO
			return "";
		}

		private void testEquals(string input, string expect, string actual)
		{
			if (expect.ToLower() == actual.ToLower()) {
				if (expect != expect.ToLower() && expect == actual) {
					Console.WriteLine("PASS (Bonus)! {0} -> {1}", input, actual);
				} else {
					Console.WriteLine("PASS! {0} -> {1}", input, actual);
				}
			} else {
				Console.WriteLine("FAIL!");
				Console.WriteLine("  Input: {0}", input);
				Console.WriteLine("  Expect: {0}", expect);
				Console.WriteLine("  Actual: {0}", actual);
			}
		}

	}
}
