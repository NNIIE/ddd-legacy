package kitchenpos.application;

import kitchenpos.domain.MenuGroup;
import kitchenpos.domain.MenuGroupRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@DisplayName("MenuGroup")
class MenuGroupServiceTest {

    @Mock
    private MenuGroupRepository menuGroupRepository;

    @InjectMocks
    private MenuGroupService menuGroupService;

    private static final UUID MENU_GROUP_ID = UUID.randomUUID();
    private static final String MENU_GROUP_NAME = "name";
    private MenuGroup menuGroup;

    @BeforeEach
    void setUp() {
        menuGroup = new MenuGroup();
        menuGroup.setId(MENU_GROUP_ID);
        menuGroup.setName(MENU_GROUP_NAME);
    }

    @Test
    @DisplayName("메뉴그룹은 식별키, 이름을 가진다.")
    void menuGroupTest1() {
        assertThat(menuGroup.getName()).isEqualTo(MENU_GROUP_NAME);
        assertThat(menuGroup.getId()).isEqualTo(MENU_GROUP_ID);
    }

    @Test
    @DisplayName("메뉴그룹을 등록한다.")
    void menuGroupTest2() {
        // Given
        when(menuGroupRepository.save(any())).thenReturn(menuGroup);

        // When
        MenuGroup result = menuGroupService.create(menuGroup);

        // Then
        assertThat(result).isEqualTo(menuGroup);
    }

    @ParameterizedTest
    @NullAndEmptySource
    @DisplayName("메뉴그룹의 이름은 비어있거나 공백일 수 없다.")
    void menuGroupTest3(String name) {
        // Given
        MenuGroup menuGroup = new MenuGroup();

        // When
        menuGroup.setName(name);

        // Then
        assertThatThrownBy(() -> menuGroupService.create(menuGroup))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("메뉴그룹 전체 목록을 조회할 수 있다.")
    void menuGroupTest4() {
        // Given
        List<MenuGroup> menuGroups = List.of(new MenuGroup(), new MenuGroup());
        when(menuGroupRepository.findAll()).thenReturn(menuGroups);

        // When
        List<MenuGroup> findAllMenuGroups = menuGroupService.findAll();

        // Then
        assertThat(findAllMenuGroups.size()).isEqualTo(2);
    }

}