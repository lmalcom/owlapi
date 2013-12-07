package org.obolibrary.owl;

import org.semanticweb.owlapi.model.OWLOntologyFormat;

/** Format for serializing an OWL ontology in a functional syntax format and
 * labels instead of identifiers. WARNING: This will produce a file, which
 * cannot be read with the OWL-API. This is only intended to be used as basis
 * for human readable version version control diffs. */
public class LabelFunctionalFormat extends OWLOntologyFormat {
    private static final long serialVersionUID = 30406L;
}
