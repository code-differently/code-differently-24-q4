## User Story 1: Offline Learning Mode for Language App
<b>As a</b> language learner,<br><b>I want</b> an offline mode in the language learning app,<br><b>so I</b> can continue learning without an internet connection.

### Acceptance Criteria
<ol>
    <li><b>Access to Lessons:</b>
        <ul>
            <li>Users can download specific lessons and exercises for offline access.</li>
            <li>A clear indicator shows which lessons are available for offline use.</li>
        </ul>
    </li>
    <li><b>Content Availability:</b>
        <ul>
            <li>All downloaded lessons should be fully functional without an internet connection.</li>
            <li>Any media (audio, video) within the lessons must be accessible offline.</li>
        </ul>
    </li>
    <li><b>Sync Progress:</b>
        <ul>
            <li>Users’ progress should sync automatically when the app reconnects to the internet.</li>
            <li>Any completed lessons or exercises should be saved and updated in the user’s profile once online.</li>
        </ul>
    </li>
</ol>

## User Story 2: Receive E-Statements for Bank Account
<b>As a</b> customer,<br><b>I want</b> to receive e-statements for my bank account,<br><b>so I</b> can reduce paper waste.

### Acceptance Criteria
<ol>
    <li><b>Customer Information Validation:</b>
        <ul>
            <li>The system verifies that the customer has a valid and active email address before enabling e-statement delivery.</li>
            <li>If the email address is invalid, the system prompts the user to update their information.</li>
        </ul>
    </li>
    <li><b>E-statement Delivery</b>
        <ul>
            <li>E-statements must be sent to the customer’s registered email address monthly (or according to the account’s statement cycle).</li>
            <li>The email subject line should clearly indicate it is a bank statement (e.g., "[Bank Name] - Your Monthly Statement for [Month]").</li>
            <li>The e-statement must be attached as a PDF file.
</li>
        </ul>
    </li>
    <li><b>Notification Preferences Management:</b>
        <ul>
            <li>The customer must be able to modify their email address or opt out of e-statements at any time through the bank's website or mobile app.</li>
            <li>Upon opting out, the customer should receive a confirmation message, and the system should revert to sending paper statements.</li>
        </ul>
    </li>
</ol>

## User Story 3: Keyboard Navigation for Faster Programming
<b>As a</b> software engineer,<br><b>I want</b> to be able to navigate the IDE using keyboard shortcuts,<br><b>so that I</b> can perform actions more quickly.

### Acceptance Criteria
<ol>
    <li><b>Shortcut configuration:</b></li>
        <ul>
            <li>The IDE must provide a default set of keyboard shortcuts for common actions (e.g., opening files, saving files, navigating between files, searching, etc.).</li>
            <li>The software engineer must be able to customize keyboard shortcuts through the IDE settings/preferences menu.</li>
            <li>There must be an option to reset all keyboard shortcuts to their default settings.</li>
        </ul>
    <li><b>Common actions support:</b></li>
        <ul>
            <li>
            The following common actions must be accessible via keyboard shortcuts:
                <ul>
                <li>Opening, closing, and saving files.</li>
                <li>Navigating between open tabs or files.</li>
                <li>Searching within the file and across the project.</li>
                <li>Running and debugging the code.</li>
                <li>Copying, pasting, and duplicating lines of code.</li>
                <li>Formatting code and applying indentation.</li>
                <li>Commenting and uncommenting lines or blocks of code.</li>
                </ul>
            </li>
        </ul>
    <li><b>Shortcut discoverability:</b></li>
        <ul>
            <li>The IDE must provide a way to view all available keyboard shortcuts (e.g., a "Keyboard Shortcuts" menu or help section).</li>
            <li>When hovering over action buttons in the IDE interface, the corresponding keyboard shortcut must be displayed in the tooltip.</li>
        </ul>
</ol>