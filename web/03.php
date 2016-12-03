<?php
	header('Content-Type: application/json');
	if ($_GET['param1'] == null and $_GET['param2']==null){
		$arr = array ('error'=> true);
		urlencode($arr);
		echo json_encode($arr);	
	}else if($_GET['param1'] == null){
		$arr = array ('error'=> true);
		urlencode($arr);
		echo json_encode($arr);
	}else if($_GET['param2'] == null){
		$arr = array ('error'=> true);
		urlencode($arr);
		echo json_encode($arr);
	}else{
		if( $_GET['param1'] == $_GET['param2']){
			$arr = array ('error'=> false,'result'=> true);
			urlencode($arr);
			echo json_encode($arr);
		}else{
			$arr = array ('error'=> false,'result'=> false);
			urlencode($arr);
			echo json_encode($arr);
		}
	}
?>