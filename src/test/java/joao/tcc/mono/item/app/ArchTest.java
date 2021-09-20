package joao.tcc.mono.item.app;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

class ArchTest {

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {
        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("joao.tcc.mono.item.app");

        noClasses()
            .that()
            .resideInAnyPackage("joao.tcc.mono.item.app.service..")
            .or()
            .resideInAnyPackage("joao.tcc.mono.item.app.repository..")
            .should()
            .dependOnClassesThat()
            .resideInAnyPackage("..joao.tcc.mono.item.app.web..")
            .because("Services and repositories should not depend on web layer")
            .check(importedClasses);
    }
}
