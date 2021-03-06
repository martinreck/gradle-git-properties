package com.gorylenko.properties

import org.ajoberstar.grgit.Grgit

class DirtyProperty extends AbstractGitProperty {

    String doCall(Grgit repo) {
        return !repo.status().clean
    }
}
