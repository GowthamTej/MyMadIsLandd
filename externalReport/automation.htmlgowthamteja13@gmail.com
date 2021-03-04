
<!DOCTYPE html>
<html>


<head>
	<meta charset='utf-8' /> 
	<meta name='description' content='' />
	<meta name='robots' content='noodp, noydir' />
	<meta name='viewport' content='width=device-width, initial-scale=1' />
	<meta id="timeStampFormat" name="timeStampFormat" content='EEEE, MMMM dd, yyyy, hh:mm a '('zzz')''/>
	
	<link href='https://fonts.googleapis.com/css?family=Source+Sans+Pro:400,600' rel='stylesheet' type='text/css'>
	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

		<link href='https://cdn.rawgit.com/anshooarora/extentreports-java/bee7a4abdc590e21eec8618a90c81ff4d16e500a/dist/css/extent.css' type='text/css' rel='stylesheet' />
	
	<title>AutoMation Report</title>

	<style type='text/css'>
	</style>
</head>

	<body class='extent dark default hide-overflow '>
		<div id='theme-selector' alt='Click to toggle theme. To enable by default, use theme configuration.' title='Click to toggle theme. To enable by default, use theme configuration.'>
			<span><i class='material-icons'>desktop_windows</i></span>
		</div>

<nav>
	<div class="nav-wrapper">
		<a href="#!" class="brand-logo blue darken-3">Extent</a>

		<!-- slideout menu -->
		<ul id='slide-out' class='side-nav fixed hide-on-med-and-down'>
			<li class='waves-effect active'><a href='#!' view='test-view' onclick="configureView(0);chartsView('test');"><i class='material-icons'>dashboard</i></a></li>
						<li class='waves-effect'><a href='#!' onclick="configureView(-1);chartsView('dashboard');" view='dashboard-view'><i class='material-icons'>track_changes</i></i></a></li>
		</ul>

		<!-- report name -->
		<span class='report-name'>Functional Report</span>
		
		<!-- report headline -->
		<span class='report-headline'></span>

		<!-- nav-right -->
		<ul id='nav-mobile' class='right hide-on-med-and-down nav-right'>
			<li>
                <a href='#!'>
                    <span class='label suite-start-time blue darken-3'>Saturday, February 27, 2021, 03:26 AM (PST)</span>
				</a>
			</li>
			<li>
                <a href='#!'>
                    <span class='label blue darken-3'>v3.1.1</span>
				</a>
			</li>
		</ul>
	</div>
</nav>

		<!-- container -->
		<div class='container'>

<div id='test-view' class='view'>
				
	<section id='controls'>
		<div class='controls grey lighten-4'>
			<!-- test toggle -->
			<div class='chip transparent'>
				<a class='dropdown-button tests-toggle' data-activates='tests-toggle' data-constrainwidth='true' data-beloworigin='true' data-hover='true' href='#'>
					<i class='material-icons'>warning</i> Status
				</a>
				<ul id='tests-toggle' class='dropdown-content'>
											<li status='pass'><a href='#!'>Pass <i class='material-icons green-text'>check_circle</i></a></li>
						<li status='fail'><a href='#!'>Fail <i class='material-icons red-text'>cancel</i></a></li>
					<li class='divider'></li>
					<li status='clear' clear='true'><a href='#!'>Clear Filters <i class='material-icons'>clear</i></a></li>
				</ul>
			</div>
			<!-- test toggle -->

			<!-- category toggle -->
			<!-- category toggle -->

			<!-- clear filters -->
			<div class='chip transparent hide'>
				<a class='' id='clear-filters' alt='Clear Filters' title='Clear Filters'>
					<i class='material-icons'>close</i> Clear
				</a>
			</div>
			<!-- clear filters -->

			<!-- enable dashboard -->
			<div id='toggle-test-view-charts' class='chip transparent'>
				<a class='pink-text' id='enable-dashboard' alt='Enable Dashboard' title='Enable Dashboard'>
					<i class='material-icons'>track_changes</i> Dashboard
				</a>
			</div>
			<!-- enable dashboard -->

			<!-- search -->
			<div class='chip transparent' alt='Search Tests' title='Search Tests'>
				<a href="#" class='search-div'>
					<i class='material-icons'>search</i> Search
				</a>

				<div class='input-field left hide'>
					<input id='search-tests' type='text' class='validate browser-default' placeholder='Search Tests...'>
				</div>
				
			</div>
			<!-- search -->
		</div>
	</section>


	<div class='subview-left left'>
		
		<div class='view-summary'>
			<h5>Tests</h5>
			<ul id='test-collection' class='test-collection'>
				
				
				<li class='test displayed active  pass' status='pass' bdd='false' test-id='1'>
					<div class='test-heading'>
						<span class='test-name'>TestvalidLogin</span>
						<span class='test-time'>Saturday, February 27, 2021, 03:26 AM (PST)</span>
						<span class='test-status right pass'>pass</span>
					</div>
					<div class='test-content hide'>
<div class='test-time-info'>
	<span class='label start-time'>Saturday, February 27, 2021, 03:26 AM (PST)</span>
	<span class='label end-time'>Saturday, February 27, 2021, 03:26 AM (PST)</span>
	<span class='label time-taken grey lighten-1 white-text'>0h 0m 4s+424ms</span>
</div>
	<div class='test-steps'>
		<table class='bordered table-results'>
			<thead>
				<tr>
					<th>Status</th>
					<th>Timestamp</th>
					<th>Details</th>
				</tr>
			</thead>
			<tbody>
				<tr class='log' status='pass'>
					<td class='status pass' title='pass' alt='pass'><i class='material-icons'>check_circle</i></td>
					<td class='timestamp'>3:26:50 AM</td>
					<td class='step-details'>Test passed</td>
				</tr>
			</tbody>
		</table>
	</div>
					</div>
				</li>
				
				
				<li class='test displayed active  pass' status='pass' bdd='false' test-id='2'>
					<div class='test-heading'>
						<span class='test-name'>TestInvalidLogin</span>
						<span class='test-time'>Saturday, February 27, 2021, 03:27 AM (PST)</span>
						<span class='test-status right pass'>pass</span>
					</div>
					<div class='test-content hide'>
<div class='test-time-info'>
	<span class='label start-time'>Saturday, February 27, 2021, 03:27 AM (PST)</span>
	<span class='label end-time'>Saturday, February 27, 2021, 03:27 AM (PST)</span>
	<span class='label time-taken grey lighten-1 white-text'>0h 0m 3s+528ms</span>
</div>
	<div class='test-steps'>
		<table class='bordered table-results'>
			<thead>
				<tr>
					<th>Status</th>
					<th>Timestamp</th>
					<th>Details</th>
				</tr>
			</thead>
			<tbody>
				<tr class='log' status='pass'>
					<td class='status pass' title='pass' alt='pass'><i class='material-icons'>check_circle</i></td>
					<td class='timestamp'>3:27:09 AM</td>
					<td class='step-details'>Test passed</td>
				</tr>
			</tbody>
		</table>
	</div>
					</div>
				</li>
				
				
				<li class='test displayed active  pass' status='pass' bdd='false' test-id='3'>
					<div class='test-heading'>
						<span class='test-name'>TestHomePgae_Accessibility</span>
						<span class='test-time'>Saturday, February 27, 2021, 03:27 AM (PST)</span>
						<span class='test-status right pass'>pass</span>
					</div>
					<div class='test-content hide'>
<div class='test-time-info'>
	<span class='label start-time'>Saturday, February 27, 2021, 03:27 AM (PST)</span>
	<span class='label end-time'>Saturday, February 27, 2021, 03:27 AM (PST)</span>
	<span class='label time-taken grey lighten-1 white-text'>0h 0m 15s+488ms</span>
</div>
	<div class='test-steps'>
		<table class='bordered table-results'>
			<thead>
				<tr>
					<th>Status</th>
					<th>Timestamp</th>
					<th>Details</th>
				</tr>
			</thead>
			<tbody>
				<tr class='log' status='pass'>
					<td class='status pass' title='pass' alt='pass'><i class='material-icons'>check_circle</i></td>
					<td class='timestamp'>3:27:39 AM</td>
					<td class='step-details'>Test passed</td>
				</tr>
			</tbody>
		</table>
	</div>
					</div>
				</li>
				
				
				<li class='test displayed active  fail' status='fail' bdd='false' test-id='4'>
					<div class='test-heading'>
						<span class='test-name'>testVipPage</span>
						<span class='test-time'>Saturday, February 27, 2021, 03:27 AM (PST)</span>
						<span class='test-status right fail'>fail</span>
					</div>
					<div class='test-content hide'>
<div class='test-time-info'>
	<span class='label start-time'>Saturday, February 27, 2021, 03:27 AM (PST)</span>
	<span class='label end-time'>Saturday, February 27, 2021, 03:28 AM (PST)</span>
	<span class='label time-taken grey lighten-1 white-text'>0h 0m 32s+324ms</span>
</div>
	<div class='test-steps'>
		<table class='bordered table-results'>
			<thead>
				<tr>
					<th>Status</th>
					<th>Timestamp</th>
					<th>Details</th>
				</tr>
			</thead>
			<tbody>
				<tr class='log' status='fail'>
					<td class='status fail' title='fail' alt='fail'><i class='material-icons'>cancel</i></td>
					<td class='timestamp'>3:28:25 AM</td>
					<td class='step-details'>Test Failedorg.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"xpath","selector":"//ul[@class='checkout-types top']/li/button"}
  (Session info: chrome=88.0.4324.190)
For documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html
Build info: version: '3.141.59', revision: 'e82be7d358', time: '2018-11-14T08:17:03'
System info: host: 'LENOVO', ip: '192.168.10.38', os.name: 'Windows 10', os.arch: 'amd64', os.version: '10.0', java.version: '14.0.1'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Capabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 88.0.4324.190, chrome: {chromedriverVersion: 88.0.4324.96 (68dba2d8a0b14..., userDataDir: C:\Users\GOWTHA~1\AppData\L...}, goog:chromeOptions: {debuggerAddress: localhost:50910}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}
Session ID: 7a5b78a7853b3727b80bd02dfcb361be
*** Element info: {Using=xpath, value=//ul[@class='checkout-types top']/li/button}.....[Ljava.lang.Object;@283ab206....[]</td>
				</tr>
			</tbody>
		</table>
	</div>
					</div>
				</li>
				
				
				<li class='test displayed active  fail' status='fail' bdd='false' test-id='5'>
					<div class='test-heading'>
						<span class='test-name'>VipBillingTest</span>
						<span class='test-time'>Saturday, February 27, 2021, 03:28 AM (PST)</span>
						<span class='test-status right fail'>fail</span>
					</div>
					<div class='test-content hide'>
<div class='test-time-info'>
	<span class='label start-time'>Saturday, February 27, 2021, 03:28 AM (PST)</span>
	<span class='label end-time'>Saturday, February 27, 2021, 03:29 AM (PST)</span>
	<span class='label time-taken grey lighten-1 white-text'>0h 0m 28s+695ms</span>
</div>
	<div class='test-steps'>
		<table class='bordered table-results'>
			<thead>
				<tr>
					<th>Status</th>
					<th>Timestamp</th>
					<th>Details</th>
				</tr>
			</thead>
			<tbody>
				<tr class='log' status='fail'>
					<td class='status fail' title='fail' alt='fail'><i class='material-icons'>cancel</i></td>
					<td class='timestamp'>3:29:12 AM</td>
					<td class='step-details'>Test Failedorg.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"xpath","selector":"//ul[@class='checkout-types top']/li/button"}
  (Session info: chrome=88.0.4324.190)
For documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html
Build info: version: '3.141.59', revision: 'e82be7d358', time: '2018-11-14T08:17:03'
System info: host: 'LENOVO', ip: '192.168.10.38', os.name: 'Windows 10', os.arch: 'amd64', os.version: '10.0', java.version: '14.0.1'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Capabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 88.0.4324.190, chrome: {chromedriverVersion: 88.0.4324.96 (68dba2d8a0b14..., userDataDir: C:\Users\GOWTHA~1\AppData\L...}, goog:chromeOptions: {debuggerAddress: localhost:50950}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}
Session ID: 131a5bf2e2cbfeb4c91bafe43610a9c5
*** Element info: {Using=xpath, value=//ul[@class='checkout-types top']/li/button}.....[Ljava.lang.Object;@4c65d8e3....[]</td>
				</tr>
			</tbody>
		</table>
	</div>
					</div>
				</li>
			</ul>
		</div>
	</div>
	<!-- subview left -->

	<div class='subview-right left'>
		<div class='view-summary'>
			<h5 class='test-name'></h5>

			<div id='step-filters' class="right">
				<span class="blue-text" status="info" alt="info" title="info"><i class="material-icons">info_outline</i></span>
				<span class="green-text" status="pass" alt="pass" title="pass"><i class="material-icons">check_circle</i></span>
				<span class="red-text" status="fail" alt="fail" title="fail"><i class="material-icons">cancel</i></span>
				<span class="red-text text-darken-4" status="fatal" alt="fatal" title="fatal"><i class="material-icons">cancel</i></span>
				<span class="pink-text text-lighten-1" status="error" alt="error" title="error"><i class="material-icons">error</i></span>
				<span class="orange-text" alt="warning" status="warning" title="warning"><i class="material-icons">warning</i></span>
				<span class="teal-text" status="skip" alt="skip" title="skip"><i class="material-icons">redo</i></span>
				<span status="clear" alt="Clear filters" title="Clear filters"><i class="material-icons">clear</i></span>
			</div>
		</div>
	</div>
	<!-- subview right -->


<div id='test-view-charts' class='subview-full'>
	<div id='charts-row' class='row nm-v nm-h'>
		<div class='col s12 m6 l6 np-h'>
			<div class='card-panel nm-v'>
				<div class='left panel-name'>Tests</div>
				<div class='chart-box'>
					<canvas id='parent-analysis' width='100' height='80'></canvas>
				</div>
				<div class='block text-small'>
					<span class='tooltipped' data-position='top' data-tooltip='60%'><span class='strong'>3</span> test(s) passed</span>
				</div>
				<div class='block text-small'>
					<span class='strong tooltipped' data-position='top' data-tooltip='40%'>2</span> test(s) failed, <span class='strong tooltipped' data-position='top' data-tooltip='0%'>0</span> others
				</div>
			</div>
		</div>
		
		<div class='col s12 m6 l6 np-h'>
			<div class='card-panel nm-v'>
				<div class='left panel-name'>Steps</div>
				<div class='chart-box'>
					<canvas id='child-analysis' width='100' height='80'></canvas>
				</div>
				<div class='block text-small'>
					<span class='tooltipped' data-position='top' data-tooltip='60%'><span class='strong'>3</span> step(s) passed</span>
				</div>
				<div class='block text-small'>
					<span class='strong tooltipped' data-position='top' data-tooltip='40%'>2</span> step(s) failed, <span class='strong tooltipped' data-position='top' data-tooltip='0%'>0</span> others
				</div>
			</div>
		</div>
		
	</div>
</div>
</div>
<!-- test view -->
<!-- category view -->
<!-- exception view -->
<div id='dashboard-view' class='view hide'>
	<div class='card-panel transparent np-v'>
		<h5>Dashboard</h5>

		<div class='row'>
			<div class='col s2'>
				<div class='card-panel r'>
					Tests
					<div class='panel-lead'>5</div>
				</div>
			</div>
			<div class='col s2'>
				<div class='card-panel r'>
					Steps
					<div class='panel-lead'>5</div>
				</div>
			</div>
			<div class='col s2'>
				<div class='card-panel r'>
					Start
					<div class='panel-lead'>Saturday, February 27, 2021, 03:26 AM (PST)</div>
				</div>
			</div>
			<div class='col s2'>
				<div class='card-panel r'>
			 		End
			 		<div class='panel-lead'>Saturday, February 27, 2021, 03:29 AM (PST)</div>
				</div>
			</div>
			<div class='col s2'>
				<div class='card-panel r'>
					Time Taken
					<div class='panel-lead'>152,590ms</div>
				</div>
			</div>
			<div class='col s4'>
				<div class='card-panel dashboard-environment'>
					<span class='right label cyan white-text'>Environment</span><p>&nbsp;</p>
					
					<table>
						<tr>
							<th>Name</th>
							<th>Value</th>
						</tr>
							<tr>
								<td>OS</td>
								<td>Windows</td>
							</tr>
							<tr>
								<td>AUT</td>
								<td>QA</td>
							</tr>
					</table>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- dashboard view -->
<!-- testrunner-logs view -->
		</div>
		<!-- container -->

		<script>
			var statusGroup = {
				passParent: 3,
				failParent: 2,
				fatalParent: 0,
				errorParent: 0,
				warningParent: 0,
				skipParent: 0,
				exceptionsParent: 2,
				
				passChild: 3,
				failChild: 2,
				fatalChild: 0,
				errorChild: 0,
				warningChild: 0,
				skipChild: 0,
				infoChild: 0,
				exceptionsChild: 2,
				
				passGrandChild: 0,
				failGrandChild: 0,
				fatalGrandChild: 0,
				errorGrandChild: 0,
				warningGrandChild: 0,
				skipGrandChild: 0,
				infoGrandChild: 0,
				exceptionsGrandChild: 0,
			};
		</script>
		
			<script src='https://cdn.rawgit.com/anshooarora/extentreports-java/fca20fb7653aade98810546ab96a2a4360e3e712/dist/js/extent.js' type='text/javascript'></script>
		
		
 		<script type='text/javascript'>
 		</script>
	</body>
	
</html>
