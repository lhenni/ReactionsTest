package mir.routines.test;

import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutinesFacade;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRoutinesFacadesProvider;
import tools.vitruv.extensions.dslsruntime.reactions.RoutinesFacadeExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath;

@SuppressWarnings("all")
public class RoutinesFacadesProvider extends AbstractRoutinesFacadesProvider {
  public AbstractRepairRoutinesFacade createRoutinesFacade(final ReactionsImportPath reactionsImportPath, final RoutinesFacadeExecutionState sharedExecutionState) {
    switch(reactionsImportPath.getPathString()) {
    	case "test": {
    		return new mir.routines.test.RoutinesFacade(this, reactionsImportPath.getParent(), sharedExecutionState);
    	}
    	case "test.extended": {
    		return new mir.routines.extended.RoutinesFacade(this, reactionsImportPath.getParent(), sharedExecutionState);
    	}
    	case "test.extended.base": {
    		return new mir.routines.extended.base.RoutinesFacade(this, reactionsImportPath.getParent(), sharedExecutionState);
    	}
    	case "test.extended.base.commonFunctions": {
    		return new mir.routines.extended.base.commonFunctions.RoutinesFacade(this, reactionsImportPath.getParent(), sharedExecutionState);
    	}
    	default: {
    		return null;
    	}
    }
  }
}