package com.rbittencourt.hexagonal.architecture.sample.architecture;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

@AnalyzeClasses(packages="com.rbittencourt.hexagonal.architecture.sample", importOptions = ImportOption.DoNotIncludeTests.class)
public class GeneralTestArchitecture {

    private static final String ANTICORRUPTION = "anticorruption";
    private static final String APPLICATION = "application";
    private static final String DOMAIN = "domain";
    private static final String INFRASTRUCTURE = "infrastructure";

    @ArchTest
    private ArchRule rule = layeredArchitecture()
        .layer(ANTICORRUPTION).definedBy("..anticorruption..")
        .layer(APPLICATION).definedBy("..application..")
        .layer(DOMAIN).definedBy("..domain..")
        .layer(INFRASTRUCTURE).definedBy("..infrastructure..")
        .whereLayer(APPLICATION).mayOnlyBeAccessedByLayers(ANTICORRUPTION)
        .whereLayer(DOMAIN).mayOnlyBeAccessedByLayers(ANTICORRUPTION, APPLICATION, INFRASTRUCTURE)
        .whereLayer(INFRASTRUCTURE).mayOnlyBeAccessedByLayers(ANTICORRUPTION, APPLICATION);

}
