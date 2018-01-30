package mir.routines.application;

import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutinesFacade;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRoutinesFacadesProvider;
import tools.vitruv.extensions.dslsruntime.reactions.RoutinesFacadeExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath;

@SuppressWarnings("all")
public class RoutinesFacadesProvider extends AbstractRoutinesFacadesProvider {
  public AbstractRepairRoutinesFacade createRoutinesFacade(final ReactionsImportPath reactionsImportPath, final RoutinesFacadeExecutionState sharedExecutionState) {
    switch(reactionsImportPath.getPathString()) {
    	case "Application": {
    		return new mir.routines.application.RoutinesFacade(this, reactionsImportPath, sharedExecutionState);
    	}
    	case "Application.Extended": {
    		return new mir.routines.extended.RoutinesFacade(this, reactionsImportPath, sharedExecutionState);
    	}
    	case "Application.Extended.Base": {
    		return new mir.routines.extended.base.RoutinesFacade(this, reactionsImportPath, sharedExecutionState);
    	}
    	case "Application.Extended.Base.CommonFunctions": {
    		return new mir.routines.extended.base.commonFunctions.RoutinesFacade(this, reactionsImportPath, sharedExecutionState);
    	}
    	case "Application.Base2": {
    		return new mir.routines.base2.RoutinesFacade(this, reactionsImportPath, sharedExecutionState);
    	}
    	case "Application.Base2.CommonFunctions": {
    		return new mir.routines.commonFunctions.RoutinesFacade(this, reactionsImportPath, sharedExecutionState);
    	}
    	default: {
    		return null;
    	}
    }
  }
}
