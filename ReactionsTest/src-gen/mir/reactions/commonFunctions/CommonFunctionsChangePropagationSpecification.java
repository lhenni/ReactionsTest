package mir.reactions.commonFunctions;

import tools.vitruv.extensions.dslsruntime.reactions.AbstractReactionsChangePropagationSpecification;

@SuppressWarnings("all")
public class CommonFunctionsChangePropagationSpecification extends AbstractReactionsChangePropagationSpecification {
  public CommonFunctionsChangePropagationSpecification() {
    super(new tools.vitruv.testutils.domains.AllElementTypesDomainProvider().getDomain(), 
    	new tools.vitruv.testutils.domains.AllElementTypesDomainProvider().getDomain());
  }
  
  protected void setup() {
    this.addChangeMainprocessor(new mir.reactions.commonFunctions.ReactionsExecutor());
  }
}
