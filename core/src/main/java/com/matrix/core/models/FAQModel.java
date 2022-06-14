package com.matrix.core.models;

import java.util.List;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

@Model(adaptables = SlingHttpServletRequest.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class FAQModel {
	
	@ChildResource
	private List<FAQItemModel> accordionlinks;

	public List<FAQItemModel> getAccordionlinks() {
		return accordionlinks;
	}
	
}
