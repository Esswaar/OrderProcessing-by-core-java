import React from 'react'
import { NavDropdown, Nav, Container, Row, Col } from 'react-bootstrap'
import { LinkContainer } from 'react-router-bootstrap'
import Dashboard from './validation-dashboard';
import 'bootstrap/dist/css/bootstrap.min.css';
import TreeMenu from "react-simple-tree-menu";
import "react-simple-tree-menu/dist/main.css";



export default function Validation() {

    const [loadDashboard, setLoadDashboard] = React.useState(false);

    const [loadValidationRules, setLoadValidationRules] = React.useState(false);

    const handleClick = (node) => {
        if (node.level != 0) {
            setLoadDashboard(true);
        } else {
            setLoadValidationRules(true);
        }
        console.log(node.level);
    }

    const handleRuleClick = (node) => {
        if (node.level == 0) {
            setLoadDashboard(true);
            setLoadValidationRules(false);
        }
    }



    const validationRules = [
        {
            "key": 1,
            "label": "Validation_Rule_1"
        },
        {
            "key": 2,
            "label": "Validation_Rule_2"
        },
        {
            "key": 3,
            "label": "Validation_Rule_3"
        },
        {
            "key": 4,
            "label": "Validation_Rule_4"
        },
        {
            "key": 5,
            "label": "Validation_Rule_5"
        }
    ]


    // data will be replaced by service
    const productlist = [
        {
            "key": 1,
            "label": "Prouct 1",
            "nodes": validationRules
        },
        {
            "key": 2,
            "label": "Prouct 2",
            "nodes": validationRules
        },
        {
            "key": 3,
            "label": "Prouct 3",
            "nodes": validationRules
        }
    ];





    let dashboard;

    if (loadValidationRules) {
        dashboard = <Col className="tree" sm={4}>
            <TreeMenu data={validationRules}
                initialOpenNodes={false}
                hasSearch={false}
                onClickItem={handleRuleClick}
            /></Col>
    } else {
        if (loadDashboard) {
            dashboard = <Col sm={8}><Dashboard /></Col>
        } else {
            dashboard = <Col sm={8}></Col>
        }
    }

    return (
        <Container>
            <Row>
                <Col className="tree" sm={4}>
                    <TreeMenu data={productlist}
                        initialOpenNodes={false}
                        hasSearch={false}
                        onClickItem={handleClick}
                    /></Col>

                {dashboard}
            </Row>
        </Container>


    )


}