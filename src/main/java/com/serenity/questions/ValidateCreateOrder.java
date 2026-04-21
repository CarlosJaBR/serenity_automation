package com.serenity.questions;

import com.serenity.ui.OrderUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateCreateOrder implements Question<Boolean> {

	private final String customerName;

	private ValidateCreateOrder(String customerName) {
		this.customerName = customerName;
	}

	public static ValidateCreateOrder customerIsVisible(String customerName) {
		return new ValidateCreateOrder(customerName);
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		String actual = OrderUI.FIRST_ROW_CUSTOMER.resolveFor(actor)
				.getText()
				.replaceAll("\\s+", " ")
				.trim();
		return actual.equals(customerName);
	}
}
