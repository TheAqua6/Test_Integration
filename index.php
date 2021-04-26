<html>
 <head>
  <title>Test PHP</title>
 </head>
 <body>
 <?php echo '<p>Bonjour le monde</p>'; ?>
 </body>
</html>

<?php 
if (! defined('SIMPLE_TEST')) {
        define('SIMPLE_TEST', 'simpletest/');
    }
    require_once(SIMPLE_TEST . 'unit_tester.php');
    require_once(SIMPLE_TEST . 'reporter.php');

    class TestOfLogging extends UnitTestCase {
        function TestOfLogging() {
            $this->UnitTestCase();
        }
        function testCreatingNewFile() {
        }
    }
    
    $test = &new TestOfLogging();
    $test->run(new HtmlReporter());
?>
