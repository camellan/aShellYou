package in.hridayan.ashell.config;

import android.os.Environment;
import in.hridayan.ashell.BuildConfig;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public interface Const {
  String SHARED_PREFS = BuildConfig.APPLICATION_ID + "_preferences";

  String DEV_EMAIL = "hridayanofficial@gmail.com";

  // preferences tags
  String PREF_FIRST_LAUNCH = "first_launch";
  String PREF_AMOLED_THEME = "id_amoled_theme";
  String PREF_THEME_MODE = "id_theme_mode";
  String PREF_COUNTER_PREFIX = "counter_";
  String PREF_PINNED_PREFIX = "pinned";
  String PREF_CLEAR = "id_clear";
  String PREF_SHARE_AND_RUN = "id_share_and_run";
  String PREF_DISABLE_SOFTKEY = "id_disable_softkey";
  String PREF_DYNAMIC_COLORS = "id_dynamic_colors";
  String PREF_OVERRIDE_BOOKMARKS = "id_override_bookmarks";
  String PREF_SMOOTH_SCROLL = "id_smooth_scroll";
  String PREF_SAVED_VERSION_CODE = "saved_version_code";
  String PREF_SORTING_OPTION = "sorting_option";
  String PREF_SORTING_EXAMPLES = "sorting_examples";
  String PREF_CURRENT_FRAGMENT = "current_fragment";
  String PREF_AUTO_UPDATE_CHECK = "id_auto_update_check";
  String PREF_SAVE_PREFERENCE = "id_save_preference";
  String PREF_LATEST_VERSION_NAME = "latest_version_name";
  String PREF_LAST_SAVED_FILENAME = "last_saved_filename";
  String PREF_HAPTICS_AND_VIBRATION = "id_vibration";
  String PREF_LOCAL_ADB_MODE = "id_local_adb_mode";
  String PREF_ACTIVITY_RECREATED = "activity_recreated";
  String PREF_EXAMPLES_LAYOUT_STYLE = "id_examples_layout_style";
  String PREF_OUTPUT_SAVE_DIRECTORY = "output_save_directory";
  String PREF_UNKNOWN_SOURCE_PERM_ASKED = "unknown_source_permission";
  String PREF_UPDATE_APK_FILE_NAME = "update_apk_file_name";
  String PREF_DEFAULT_SAVE_DIRECTORY =
      Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
          .getAbsolutePath();
  String ADB_IP = "adb_ip";
  String ADB_PAIRING_PORT = "adb_pairing_port";
  String ADB_CONNECTING_PORT = "adb_connecting_port";
  String ADB_PAIRING_CODE = "adb_pairing_code";

  // tags for things like onclick listeners
  String ID_LOOK_AND_FEEL = "id_look_and_feel";
  String ID_DEF_LANGUAGE = "id_default_language";
  String ID_CONFIG_SAVE_DIR = "id_configure_save_directory";
  String ID_UNHIDE_CARDS = "id_unhide_cards";
  String ID_EXAMPLES = "id_examples";
  String ID_ABOUT = "id_about";
  String ID_VERSION = "id_version";
  String ID_CHANGELOGS = "id_changelogs";
  String ID_REPORT = "id_report";
  String ID_FEATURE = "id_feature";
  String ID_GITHUB = "id_github";
  String ID_TELEGRAM = "id_telegram";
  String ID_DISCORD = "id_discord";
  String ID_LICENSE = "id_license";
  String FEEDBACK_MODE_BUG = "bug";
  String FEEDBACK_MODE_FEATURE = "feature";

  /* <--------Transition Names-------> */
  String SEND_TO_EXAMPLES = "sendButtonToExamples";
  String SETTINGS_TO_SETTINGS = "settingsButtonToSettings";
  String FRAGMENT_LOCAL_SHELL = "fragmentLocalShell";
  String FRAGMENT_OTG_SHELL = "fragmentOtgShell";
  String FRAGMENT_WIFI_ADB_SHELL = "fragmentWifiAdbShell";
  String FRAGMENT_SCRIPT_EXECUTOR = "fragmentScriptExecutor";

  /* <--------U R L s -------> */
  String URL_DEV_GITHUB = "https://github.com/DP-Hridayan";
  String URL_DEV_BM_COFFEE = "https://www.buymeacoffee.com/hridayan";

  // url for the build.gradle file of the app
  String URL_BUILD_GRADLE =
      "https://raw.githubusercontent.com/DP-Hridayan/aShellYou/master/app/build.gradle";
  String URL_OTG_INSTRUCTIONS = "https://github.com/DP-Hridayan/aShellYou/wiki/OTG-ADB-Setup-Guide";
  String URL_WIRELESS_DEBUGGING_INSTRUCTIONS =
      "https://github.com/DP-Hridayan/aShellYou/wiki/Wireless-Debugging-Setup";
  String GITHUB_OWNER = "dp-hridayan";
  String GITHUB_REPOSITORY = "ashellyou";
  String URL_GITHUB_REPOSITORY = "https://github.com/DP-Hridayan/aShellYou";
  // url for github release
  String URL_GITHUB_RELEASE = "https://github.com/DP-Hridayan/aShellYou/releases/latest";
  String URL_GITHUB_ISSUE_BUG =
      "https://github.com/DP-Hridayan/aShellYou/issues/new?template=bug_report.yml";
  String URL_GITHUB_ISSUE_FEATURE =
      "https://github.com/DP-Hridayan/aShellYou/issues/new?template=feature_request.yml";
  String URL_SHIZUKU_SITE = "https://shizuku.rikka.app/";
  String URL_APP_LICENSE = "https://github.com/DP-Hridayan/aShellYou/blob/master/LICENSE.md";
  String URL_TELEGRAM = "https://t.me/aShellYou";

  String URL_EMAIL_BUG = "mailto:hridayanofficial@gmail.com?subject=Bug%20Report";
  String URL_EMAIL_FEATURE = "mailto:hridayanofficial@gmail.com?subject=Feature%20Suggestion";

  // used in OTG utils
  String TAG = "flashbot";

  String CURRENT_FRAGMENT = "current_fragment";

  String SHIZUKU_PACKAGE_NAME = "moe.shizuku.privileged.api";

  // integers
  int SORT_A_TO_Z = 0;
  int SORT_Z_TO_A = 1;
  int SORT_MOST_USED = 2;
  int SORT_OLDEST = 2;
  int SORT_NEWEST = 3;
  int SORT_LEAST_USED = 3;
  int HOME_FRAGMENT = 2025;
  int LOCAL_FRAGMENT = 0;
  int OTG_FRAGMENT = 1;
  int WIFI_ADB_FRAGMENT = 2;
  int MODE_LOCAL_ADB = 0;
  int MODE_OTG = 1;
  int MODE_WIFI_ADB = 2;
  int MODE_REMEMBER_LAST_MODE = 3;
  int MAX_BOOKMARKS_LIMIT = 25;
  int UPDATE_AVAILABLE = 1;
  int UPDATE_NOT_AVAILABLE = 0;
  int CONNECTION_ERROR = 2;
  int LAST_COMMAND_OUTPUT = 0;
  int ALL_OUTPUT = 1;
  int BASIC_MODE = 0;
  int SHIZUKU_MODE = 1;
  int ROOT_MODE = 2;
  int LIST_STYLE = 1;
  int GRID_STYLE = 2;

  // used in OTG utils
  double PUSH_PERCENT = 0.5;

  // Set of some sensitive packages of the android which should be handled carefully while executing
  // adb commands
  Set<String> SENSITIVE_PACKAGES =
      Collections.unmodifiableSet(
          new HashSet<String>() {
            {
              add("com.android.systemui");
              add("com.android.settings");
              add("com.android.frameworkres");
              add("com.android.providers.settings");
              add("com.android.permissioncontroller");
              add("com.android.inputmethod.latin");
              add("com.android.server.telecom");
              add("com.android.phone");
              add("com.android.providers.media");
              add("com.android.packageinstaller");
              add("com.android.externalstorage");
              add("com.android.documentsui");
              add("com.android.wifi");
            }
          });

  // Check if packageName contains any of the strings in SENSITIVE_PACKAGES
  public static boolean isPackageSensitive(String packageName) {
    for (String sensitive : SENSITIVE_PACKAGES) {
      if (packageName.contains(sensitive)) {
        return true;
      }
    }
    return false;
  }

  /* <--------NAMES OF CONTRIBUTORS -------> */

  public static enum Contributors {

    // assigning names and their github profile links to each contributors
    HRIDAYAN("Hridayan", "https://github.com/DP-Hridayan"),
    KRISHNA("Krishna", "https://github.com/KrishnaSSH"),
    STARRY("Stɑrry Shivɑm", "https://github.com/starry-shivam"),
    DISAGREE("DrDisagree", "https://github.com/Mahmud0808"),
    RIKKA("RikkaApps", "https://github.com/RikkaApps/Shizuku"),
    SUNILPAULMATHEW("Sunilpaulmathew", "https://gitlab.com/sunilpaulmathew/ashell"),
    KHUN_HTETZ("Khun Htetz Naing", "https://github.com/KhunHtetzNaing/ADB-OTG"),
    MARCIOZOMB("marciozomb13", "https://github.com/marciozomb13"),
    WEIGUANGTWK("weiguangtwk", "https://github.com/WeiguangTWK"),
    WINZORT("WINZORT", "https://github.com/mikropsoft");
    private final String name, github;

    Contributors(String name, String github) {
      this.name = name;
      this.github = github;
    }

    public String getName() {
      return name;
    }

    public String getGithub() {
      return github;
    }
  }

  public static enum InfoCards {
    WARNING_USB_DEBUGGING;
  }
}
