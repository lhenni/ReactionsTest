package mir.routines.application;

import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutinesFacade;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRoutinesFacadesProvider;
import tools.vitruv.extensions.dslsruntime.reactions.RoutinesFacadeExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath;

@SuppressWarnings("all")
public class RoutinesFacadesProvider extends AbstractRoutinesFacadesProvider {
  public AbstractRepairRoutinesFacade createRoutinesFacade(final ReactionsImportPath reactionsImportPath, final RoutinesFacadeExecutionState sharedExecutionState) {
    switch(reactionsImportPath.getPathString()) {
    	case "application": {
    		return new mir.routines.application.RoutinesFacade(this, reactionsImportPath, sharedExecutionState);
    	}
    	case "application.extended": {
    		return new mir.routines.extended.RoutinesFacade(this, reactionsImportPath, sharedExecutionState);
    	}
    	case "application.extended.base": {
    		return new mir.routines.extended.base.RoutinesFacade(this, reactionsImportPath, sharedExecutionState);
    	}
    	case "application.extended.base.commonFunctions": {
    		return new mir.routines.application.extended.base.commonFunctions.RoutinesFacade(this, reactionsImportPath, sharedExecutionState);
    	}
    	case "application.base2": {
    		return new mir.routines.base2.RoutinesFacade(this, reactionsImportPath, sharedExecutionState);
    	}
    	case "application.base2.commonFunctions": {
    		return new mir.routines.commonFunctions.RoutinesFacade(this, reactionsImportPath, sharedExecutionState);
    	}
    	default: {
    		throw new IllegalArgumentException("Unexpected import path: " + reactionsImportPath.getPathString());
    	}
    }
  }
}
