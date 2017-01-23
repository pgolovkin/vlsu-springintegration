package ru.vlsu.springintegration.transformer;

import org.springframework.integration.annotation.Transformer;
import org.springframework.stereotype.Component;

@Component
public class TextMessageTransformer {

	@Transformer
	public String transform(String text) {
		return "Transformed " + text;
	}

}
